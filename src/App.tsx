import './App.css';
import Cabesalho from './components/Cabesalho';
import BottonSalvar from './components/BottonSalvar';
import BottonDeletar from './components/BottonDeletar';




function App() {
    return (
        <>


            <Cabesalho />

            <div className='Card'>
                <div className='BottonSalvarApp'>
                    <BottonSalvar />
                </div>
                <BottonDeletar />
            </div>

        </>
    )
}

export default App
