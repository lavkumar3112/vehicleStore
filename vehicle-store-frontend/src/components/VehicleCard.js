import React from "react";
import { Link } from "react-router-dom";
import { addBookmark } from "../services/api";

function VehicleCard({ vehicle }) {

  const bookmark = async () => {
    await addBookmark(vehicle.id);
    alert("Vehicle bookmarked");
  };

  return (
    <div className="card">

      <img src={vehicle.imageUrl} alt={vehicle.name} width="200"/>

      <h3>{vehicle.brand} {vehicle.name}</h3>

      <p>Price: ₹{vehicle.price}</p>

      <p>Fuel: {vehicle.fuelType}</p>

      <button onClick={bookmark}>
        Bookmark
      </button>

      <Link to={`/vehicles/${vehicle.id}`}>
        View Details
      </Link>

    </div>
  );
}

export default VehicleCard;