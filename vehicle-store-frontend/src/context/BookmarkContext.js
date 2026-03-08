import React, { createContext, useState, useEffect } from "react";
import { getBookmarks } from "../services/api";

export const BookmarkContext = createContext();

export const BookmarkProvider = ({ children }) => {

  const [bookmarks, setBookmarks] = useState([]);

  useEffect(() => {
    loadBookmarks();
  }, []);

  const loadBookmarks = async () => {
    const res = await getBookmarks();
    setBookmarks(res.data);
  };

  return (
    <BookmarkContext.Provider value={{ bookmarks, loadBookmarks }}>
      {children}
    </BookmarkContext.Provider>
  );
};