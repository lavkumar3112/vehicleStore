import React, { useState } from "react";
import { addVehicle } from "../services/api";

function AdminPage() {

  const [vehicle, setVehicle] = useState({});

  const submit = async () => {

    await addVehicle(vehicle);

    alert("Vehicle added");
  };

  return (
    <div>

      <h2>Add Vehicle</h2>

      <input placeholder="Brand"
        onChange={(e)=>setVehicle({...vehicle,brand:e.target.value})}/>

      <input placeholder="Name"
        onChange={(e)=>setVehicle({...vehicle,name:e.target.value})}/>

      <input placeholder="Price"
        onChange={(e)=>setVehicle({...vehicle,price:e.target.value})}/>

      <input placeholder="Fuel"
        onChange={(e)=>setVehicle({...vehicle,fuelType:e.target.value})}/>

      <input placeholder="Image URL"
        onChange={(e)=>setVehicle({...vehicle,imageUrl:e.target.value})}/>

      <textarea placeholder="Description"
        onChange={(e)=>setVehicle({...vehicle,description:e.target.value})}/>

      <button onClick={submit}>
        Submit
      </button>

    </div>
  );
}

export default AdminPage;