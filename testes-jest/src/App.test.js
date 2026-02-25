import { render, screen, fireEvent } from "@testing-library/react";
import App from "./App";

describe('Testes do componente App', () => {
  test('Deve renderizar o componente App', () => {
    render(<App />);
    expect(screen.getByText('Cadastrar')).toBeInTheDocument();
  });

  test('Deve adicionar "estudar Typescript" na lista de tarefas', () => {
    render(<App />);
    fireEvent.change(screen.getByTestId('campo-tarefa'), { 
      target: { 
        value: 'estudar-react' } });

    fireEvent.click(screen.getByTestId('btn-cadastrar'));

    expect(screen.getByText('estudar-react')).toBeInTheDocument();  
  });

});