import React, { useEffect, useState } from "react";
import { getBookmarks, deleteBookmark } from "../services/api";

function WishlistPage() {

  const [bookmarks, setBookmarks] = useState([]);

  useEffect(() => {
    load();
  }, []);

  const load = async () => {
    const res = await getBookmarks();
    setBookmarks(res.data);
  };

  const remove = async (id) => {
    await deleteBookmark(id);
    load();
  };

  return (
    <div>

      <h2>Wishlist</h2>

      {bookmarks.map((b) => (

        <div key={b.id}>

          {b.vehicle.name}

          <button onClick={() => remove(b.id)}>
            Remove
          </button>

        </div>

      ))}

    </div>
  );
}

export default WishlistPage;