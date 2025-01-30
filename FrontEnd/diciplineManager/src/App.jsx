import React, { useState } from 'react';
import CourseList from './components/CourseList';
import DisciplineList from './components/DisciplineList';
import AddCourseForm from './components/AddCourseForm';
import AddDisciplineForm from './components/AddDisciplineForm';
import './index.css';

const App = () => {
  const [courses, setCourses] = useState([]);
  const [disciplines, setDisciplines] = useState([]);

  const addCourse = (course) => {
    setCourses([...courses, course]);
  };

  const addDiscipline = (discipline) => {
    setDisciplines([...disciplines, discipline]);
  };

  return (
    <div className="container">
      <h1>Dicipline Manager</h1>
      {/* <AddCourseForm addCourse={addCourse} /> */}
      {/* <CourseList courses={courses} /> */}
      <AddDisciplineForm addDiscipline={addDiscipline} />
      <DisciplineList disciplines={disciplines} />
    </div>
  );
};

export default App;