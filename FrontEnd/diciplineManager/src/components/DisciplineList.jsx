import axios from 'axios';
import React, { useEffect, useState } from 'react';

const DisciplineList = ({ disciplines }) => {
  const [data, setData] = useState(disciplines)

  // requisição aqui
  function buscarDiciplinas() {
    axios.get("http://localhost:8080/diciplines")
      .then((res) => {
        // setData((prev) => [...prev, res.data])
        setData(res.data)
      })
      .catch((erro) => {
        console.log(erro)
      })
  }

  useEffect(() => {
    buscarDiciplinas()
  }, [])

  return (
    <div className="table-container">
      {/* <button onClick={buscarDiciplinas}>busca de diciplinas</button> */}
      <table>
        <thead>
          <tr>
            <th>Discipline Name</th>
            <th>Status</th>
            <th>Work Grade</th>
            <th>Test Grade</th>
            <th>Note Weight</th>
            <th>Final Grade</th>
          </tr>
        </thead>
        <tbody>
          {data.map((discipline, index) => (
            <tr key={index}>
              <td>{discipline.name}</td>
              <td>{discipline.duration}</td>
              <td>{discipline.status}</td>
              {/* <td>{discipline.testGrade}</td>
              <td>{discipline.noteWeight}</td>
              <td>{discipline.finalGrade}</td> */}
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default DisciplineList;