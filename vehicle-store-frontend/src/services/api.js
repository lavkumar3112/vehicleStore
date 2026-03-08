import axios from "axios";

const API = axios.create({
  baseURL: "http://localhost:8080/api"
});

export const getVehicles = (params) => API.get("/vehicles", { params });

export const getVehicle = (id) => API.get(`/vehicles/${id}`);

export const addVehicle = (data) => API.post("/vehicles", data);

export const addBookmark = (vehicleId) =>
  API.post("/bookmarks", { vehicleId });

export const getBookmarks = () => API.get("/bookmarks");

export const deleteBookmark = (id) =>
  API.delete(`/bookmarks/${id}`);

export const createBooking = (data) =>
  API.post("/bookings", data);

export const getSummary = () =>
  API.get("/vehicles/summary");

export default API;