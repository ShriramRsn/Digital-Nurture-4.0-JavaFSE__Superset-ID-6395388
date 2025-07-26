import React from 'react';
import CohortDetails from './CohortDetails';

const cohorts = [
  {
    name: 'React Bootcamp',
    startDate: '21-07-2025',
    endDate: '27-07-2025',
    status: 'ongoing',
  },
  {
    name: 'Spring REST using Spring Boot 3',
    startDate: '14-07-2025',
    endDate: '20-07-2025',
    status: 'completed',
  },
  {
    name: 'Spring Data JPA with Spring Boot, Hibernate',
    startDate: '07-07-2025',
    endDate: '13-07-2025',
    status: 'completed',
  },
  {
    name: 'Design principles & Patterns',
    startDate: '23-06-2025',
    endDate: '29-06-2025',
    status: 'completed',
  },
];

function App() {
  return (
    <div style={{ padding: '20px' }}>
      <h1>Cohort Tracker</h1>
      {cohorts.map((cohort, index) => (
        <CohortDetails key={index} cohort={cohort} />
      ))}
    </div>
  );
}

export default App;
