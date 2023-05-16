import { QueryClientProvider, QueryClient } from '@tanstack/react-query';
import './App.css';
import NavBar from './components/navigation/navbar';

import PositionList from './components/positions/position-list';

const queryClient = new QueryClient();

function App() {
  return (
    <QueryClientProvider client={queryClient}>
      <div className="mx-auto max-w-screen-xl py-2 px-4 lg:px-8 lg:py-4">
        <NavBar />
        <PositionList />
      </div>
    </QueryClientProvider>
  );
}

export default App;
