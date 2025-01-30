import React, { useState } from 'react';

const AddDisciplineForm = ({ addDiscipline }) => {
  const [name, setName] = useState('');
  const [status, setStatus] = useState('cursando');
  const [workGrade, setWorkGrade] = useState('');
  const [testGrade, setTestGrade] = useState('');
  const [noteWeight, setNoteWeight] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();

    const workGradeValue = workGrade === '' ? 0 : parseFloat(workGrade);
    const testGradeValue = testGrade === '' ? 0 : parseFloat(testGrade);
    const noteWeightValue = noteWeight === '' ? 0 : parseFloat(noteWeight);

    const finalGrade = calculateFinalGradeDiscipline(workGradeValue, testGradeValue, noteWeightValue);

    addDiscipline({
      name,
      status,
      workGrade: workGradeValue,
      testGrade: testGradeValue,
      noteWeight: noteWeightValue,
      finalGrade,
    });

    setName('');
    setStatus('cursando');
    setWorkGrade('');
    setTestGrade('');
    setNoteWeight('');
  };

  const calculateFinalGradeDiscipline = (workGrade, testGrade, noteWeight) => {
    return (workGrade * (1 - noteWeight / 100)) + (testGrade * (noteWeight / 100));
  };

  return (
    <form onSubmit={handleSubmit} className="add-course-section">
      <input
        type="text"
        placeholder="Discipline Name"
        value={name}
        onChange={(e) => setName(e.target.value)}
        required
      />
      <select
        value={status}
        onChange={(e) => setStatus(e.target.value)}
        className="select-field"
        required
      >
        <option value="cursando">Cursando</option>
        <option value="cursado">Cursado</option>
        <option value="não cursado">Não Cursado</option>
      </select>
      <input
        type="number"
        placeholder="Work Grade"
        value={workGrade}
        onChange={(e) => setWorkGrade(e.target.value)}
      />
      <input
        type="number"
        placeholder="Test Grade"
        value={testGrade}
        onChange={(e) => setTestGrade(e.target.value)}
      />
      <input
        type="number"
        placeholder="Note Weight"
        value={noteWeight}
        onChange={(e) => setNoteWeight(e.target.value)}
      />
      <button type="submit">Add Discipline</button>
    </form>
  );
};

export default AddDisciplineForm;
