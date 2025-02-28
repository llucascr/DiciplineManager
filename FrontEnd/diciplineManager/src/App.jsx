import React, { useState } from 'react';
import DisciplineList from './components/DisciplineList';
import AddDisciplineForm from './components/AddDisciplineForm';
import './index.css';
import cors from 'cors'

const App = () => {
  const [courses, setCourses] = useState([]);
  //     get          set
  const [disciplines, setDisciplines] = useState([]); // root

  const addCourse = (course) => {
    setCourses([...courses, course]);
  };

  const addDiscipline = (discipline) => {
    // setDisciplines([...disciplines, discipline]);
    setDisciplines((prev) => [...prev, discipline])
  };

  const removeDicipline = (nome) => {
    const buscaDiciplina = disciplines.filter((item) => item.nome != nome)
    // if else

    setDisciplines(buscaDiciplina)
  }

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