const courseList = document.getElementById('courseList');
const totalCreditsSpan = document.getElementById('totalCredits');
const gpaDisplaySpan = document.getElementById('gpaDisplay');
const disciplineList = document.getElementById('disciplineList');
const totalDisciplinesSpan = document.getElementById('totalDisciplines');
const averageFinalGradeSpan = document.getElementById('averageFinalGrade');

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

function addCourse() {
  const courseInput = document.getElementById('courseInput');
  const gradeInput = document.getElementById('gradeInput');
  const creditsInput = document.getElementById('creditsInput');
  const semesterInput = document.getElementById('semesterInput');

  if (!courseInput.value || !gradeInput.value || !creditsInput.value || !semesterInput.value) {
    alert('Please fill in all fields');
    return;
  }

  const row = courseList.insertRow();
  const finalGrade = calculateFinalGrade(gradeInput.value);
  
  row.innerHTML = `
    <td>${courseInput.value}</td>
    <td>${semesterInput.value}</td>
    <td>${creditsInput.value}</td>
    <td>${gradeInput.value}</td>
    <td>${finalGrade}</td>
  `;

  calculateGPA();

  // Clear inputs
  courseInput.value = '';
  gradeInput.value = '';
  creditsInput.value = '';
  semesterInput.value = '';
}

function calculateFinalGrade(grade) {
  // This is a simple implementation. You might want to customize the logic.
  return grade in gradePoints ? gradePoints[grade].toFixed(1) : 'N/A';
}

function calculateGPA() {
  let totalCredits = 0;
  let totalGradePoints = 0;

  Array.from(courseList.rows).forEach(row => {
    const grade = row.cells[3].textContent;
    const credits = parseInt(row.cells[2].textContent);
    
    if (gradePoints[grade] !== undefined) {
      totalCredits += credits;
      totalGradePoints += gradePoints[grade] * credits;
    }
  });

  const gpa = totalCredits > 0 ? (totalGradePoints / totalCredits).toFixed(2) : '0.00';
  
  totalCreditsSpan.textContent = totalCredits;
  gpaDisplaySpan.textContent = gpa;
}

function addDiscipline() {
  const disciplineInput = document.getElementById('disciplineInput');
  const statusInput = document.getElementById('statusInput');
  const workGradeInput = document.getElementById('workGradeInput');
  const testGradeInput = document.getElementById('testGradeInput');
  const noteWeightInput = document.getElementById('noteWeightInput');

  // Validate inputs
  if (!disciplineInput.value || !statusInput.value || !workGradeInput.value || 
      !testGradeInput.value || !noteWeightInput.value) {
    alert('Please fill in all fields');
    return;
  }

  // Calculate final grade (example calculation)
  const finalGrade = calculateFinalGradeDiscipline(
    parseFloat(workGradeInput.value), 
    parseFloat(testGradeInput.value), 
    parseFloat(noteWeightInput.value)
  );

  // Insert new row
  const row = disciplineList.insertRow();
  row.innerHTML = `
    <td>${disciplineInput.value}</td>
    <td>${statusInput.value}</td>
    <td>${workGradeInput.value}</td>
    <td>${testGradeInput.value}</td>
    <td>${noteWeightInput.value}</td>
    <td>${finalGrade.toFixed(2)}</td>
  `;

  // Update summary
  updateSummary();

  // Clear inputs
  disciplineInput.value = '';
  statusInput.value = '';
  workGradeInput.value = '';
  testGradeInput.value = '';
  noteWeightInput.value = '';
}

function calculateFinalGradeDiscipline(workGrade, testGrade, noteWeight) {
  // Example calculation: weighted average of work grade and test grade
  // You can modify this logic as needed
  return (workGrade * (1 - noteWeight/100)) + (testGrade * (noteWeight/100));
}

function updateSummary() {
  const rows = disciplineList.rows;
  const totalDisciplines = rows.length;
  
  let totalFinalGrade = 0;
  for (let row of rows) {
    totalFinalGrade += parseFloat(row.cells[5].textContent);
  }

  const averageFinalGrade = totalDisciplines > 0 ? 
    (totalFinalGrade / totalDisciplines).toFixed(2) : '0.00';

  totalDisciplinesSpan.textContent = totalDisciplines;
  averageFinalGradeSpan.textContent = averageFinalGrade;
}