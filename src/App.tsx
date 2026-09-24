import './App.css';
import Cabesalho from './components/Cabesalho';
import BottonSalvar from './components/BottonSalvar';
import BottonDeletar from './components/BottonDeletar';




function App() {
    return (
        <>


            <Cabesalho />


            <div className='Card'>
                <input
                    type="nome"
                    placeholder='Digite seu nome...'
                />

                <input
                    type="email"
                    placeholder='Digite seu E-mail'
                />
 

                

                <div className='bottonSalvarApp'>
                    <BottonSalvar />
                </div>

                <div className='bottonDeletarApp'>
                <BottonDeletar />
                </div>
            </div>


        </>
    )
}

export default App
