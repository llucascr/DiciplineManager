import React from 'react';

const CourseList = ({ courses }) => {
  return (
    <div className="table-container">
      <table>
        <thead>
          <tr>
            <th>Course Name</th>
            <th>Semester</th>
            <th>Credits</th>
            <th>Grade</th>
            <th>Final Grade</th>
          </tr>
        </thead>
        <tbody>
          {courses.map((course, index) => (
            <tr key={index}>
              <td>{course.name}</td>
              <td>{course.semester}</td>
              <td>{course.credits}</td>
              <td>{course.grade}</td>
              <td>{course.finalGrade}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default CourseList;