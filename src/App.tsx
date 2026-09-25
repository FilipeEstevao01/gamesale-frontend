import './App.css';
import Cabesalho from './components/Cabesalho';
import BottonSalvar from './components/BottonSalvar';
import BottonDeletar from './components/BottonDeletar';




function App() {
    return (
        <>


            <Cabesalho />


            <div className='Card'>

                <div className='Nome'>
                    <input
                        type="text"
                        placeholder='Digite seu nome...'
                    />
                </div>

                <div className='Email'>
                    <input
                        type="text"
                        placeholder='Digite seu E-mail'
                    />
                </div>



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
