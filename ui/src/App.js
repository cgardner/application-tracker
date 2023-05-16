import { Fragment } from 'react';
import './App.css';
import NavBar from './components/navigation/navbar';

import PositionList from './components/positions/position-list';

function App() {
  return (
    <div className="mx-auto max-w-screen-xl py-2 px-4 lg:px-8 lg:py-4">
      <NavBar />
      <PositionList />
    </div>

  );
}

export default App;
