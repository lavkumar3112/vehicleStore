import { BrowserRouter, Routes, Route } from "react-router-dom";

import CatalogPage from "./pages/CatalogPage";
import VehicleDetails from "./pages/VehicleDetails";
import WishlistPage from "./pages/WishlistPage";
import BookingPage from "./pages/BookingPage";
import DashboardPage from "./pages/DashboardPage";
import AdminPage from "./pages/AdminPage";

function App() {

  return (
    <BrowserRouter>

      <Routes>

        <Route path="/" element={<CatalogPage />} />

        <Route path="/vehicles/:id" element={<VehicleDetails />} />

        <Route path="/wishlist" element={<WishlistPage />} />

        <Route path="/book/:vehicleId" element={<BookingPage />} />

        <Route path="/dashboard" element={<DashboardPage />} />

        <Route path="/admin" element={<AdminPage />} />

      </Routes>

    </BrowserRouter>
  );
}

export default App;