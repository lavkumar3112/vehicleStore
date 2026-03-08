import React, { useEffect, useState } from "react";
import { getVehicle } from "../services/api";
import { useParams, Link } from "react-router-dom";

function VehicleDetails() {

  const { id } = useParams();

  const [vehicle, setVehicle] = useState({});

  useEffect(() => {
    loadVehicle();
  }, []);

  const loadVehicle = async () => {
    const res = await getVehicle(id);
    setVehicle(res.data);
  };

  return (
    <div>

      <h2>{vehicle.name}</h2>

      <img src={vehicle.imageUrl} width="300"/>

      <p>Brand: {vehicle.brand}</p>

      <p>Fuel: {vehicle.fuelType}</p>

      <p>Price: {vehicle.price}</p>

      <p>{vehicle.description}</p>

      <Link to={`/book/${vehicle.id}`}>
        Book Now
      </Link>

    </div>
  );
}

export default VehicleDetails;