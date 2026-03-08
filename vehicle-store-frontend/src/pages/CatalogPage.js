import React, { useEffect, useState } from "react";
import { getVehicles } from "../services/api";
import VehicleCard from "../components/VehicleCard";
import FilterBar from "../components/FilterBar";

function CatalogPage() {

  const [vehicles, setVehicles] = useState([]);
  const [filters, setFilters] = useState({});

  useEffect(() => {
    loadVehicles();
  }, [filters]);

  const loadVehicles = async () => {
    const res = await getVehicles(filters);
    setVehicles(res.data);
  };

  return (
    <div>

      <h2>Vehicle Catalog</h2>

      <FilterBar
        filters={filters}
        setFilters={setFilters}
      />

      <div className="grid">

        {vehicles.map((v) => (
          <VehicleCard
            key={v.id}
            vehicle={v}
          />
        ))}

      </div>

    </div>
  );
}

export default CatalogPage;