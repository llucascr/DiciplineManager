import React from 'react';

const DisciplineList = ({ disciplines }) => {
  return (
    <div className="table-container">
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
          {disciplines.map((discipline, index) => (
            <tr key={index}>
              <td>{discipline.name}</td>
              <td>{discipline.status}</td>
              <td>{discipline.workGrade}</td>
              <td>{discipline.testGrade}</td>
              <td>{discipline.noteWeight}</td>
              <td>{discipline.finalGrade}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default DisciplineList;