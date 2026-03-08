import React from "react";

function FilterBar({ filters, setFilters }) {

  return (
    <div>

      <select
        onChange={(e) =>
          setFilters({ ...filters, brand: e.target.value })
        }
      >
        <option value="">Brand</option>
        <option value="Tesla">Tesla</option>
        <option value="Toyota">Toyota</option>
        <option value="BMW">BMW</option>
      </select>

      <select
        onChange={(e) =>
          setFilters({ ...filters, fuelType: e.target.value })
        }
      >
        <option value="">Fuel</option>
        <option value="Petrol">Petrol</option>
        <option value="Diesel">Diesel</option>
        <option value="Electric">Electric</option>
      </select>

    </div>
  );
}

export default FilterBar;