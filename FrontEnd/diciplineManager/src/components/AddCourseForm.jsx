import React, { useState } from 'react';

const AddCourseForm = ({ addCourse }) => {
  const [name, setName] = useState('');
  const [semester, setSemester] = useState('');
  const [credits, setCredits] = useState('');
  const [grade, setGrade] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    const finalGrade = calculateFinalGrade(grade);
    addCourse({ name, semester, credits, grade, finalGrade });
    setName('');
    setSemester('');
    setCredits('');
    setGrade('');
  };

  const calculateFinalGrade = (grade) => {
    const gradePoints = {
      'A': 4.0,
      'A-': 3.7,
      'B+': 3.3,
      'B': 3.0,
      'B-': 2.7,
      'C+': 2.3,
      'C': 2.0,
      'C-': 1.7,
      'D+': 1.3,
      'D': 1.0,
      'F': 0.0
    };
    return gradePoints[grade] ? gradePoints[grade].toFixed(1) : 'N/A';
  };

  return (
    <form onSubmit={handleSubmit} className="add-course-section">
      <input type="text" placeholder="Course Name" value={name} onChange={(e) => setName(e.target.value)} required />
      <input type="text" placeholder="Semester" value={semester} onChange={(e) => setSemester(e.target.value)} required />
      <input type="number" placeholder="Credits" value={credits} onChange={(e) => setCredits(e.target.value)} required />
      <input type="text" placeholder="Grade" value={grade} onChange={(e) => setGrade(e.target.value)} required />
      <button type="submit">Add Course</button>
    </form>
  );
};

export default AddCourseForm;