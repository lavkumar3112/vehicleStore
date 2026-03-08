import React, { useState } from "react";
import { createBooking } from "../services/api";
import { useParams } from "react-router-dom";

function BookingPage() {

  const { vehicleId } = useParams();

  const [name, setName] = useState("");
  const [email, setEmail] = useState("");

  const submit = async () => {

    await createBooking({
      vehicleId,
      customerName: name,
      customerEmail: email
    });

    alert("Booking successful");
  };

  return (
    <div>

      <h2>Book Vehicle</h2>

      <input
        placeholder="Name"
        onChange={(e) => setName(e.target.value)}
      />

      <input
        placeholder="Email"
        onChange={(e) => setEmail(e.target.value)}
      />

      <button onClick={submit}>
        Book
      </button>

    </div>
  );
}

export default BookingPage;