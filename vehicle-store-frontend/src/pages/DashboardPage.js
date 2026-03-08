import React, { useEffect, useState } from "react";
import { getSummary } from "../services/api";

function DashboardPage() {

  const [data, setData] = useState([]);

  useEffect(() => {
    load();
  }, []);

  const load = async () => {
    const res = await getSummary();
    setData(res.data);
  };

  return (
    <div>

      <h2>Inventory Summary</h2>

      {data.map((d, i) => (

        <div key={i}>
          {d[0]} : {d[1]}
        </div>

      ))}

    </div>
  );
}

export default DashboardPage;