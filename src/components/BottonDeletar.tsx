import { useState } from "react";

function BottonDeletar() {

    const [nome, setNome] = useState("");

    const deletar = async () => {

        if (!nome) {
            alert("Digite o nome do usuário");
            return;
        }

        try {

            const resposta = await fetch(
                `http://localhost:8080/Usuarios/nome/${encodeURIComponent(nome)}/delete`,
                {
                    method: "DELETE",
                }
            );

            if (!resposta.ok) {
                throw new Error(`Erro HTTP: ${resposta.status}`);
            }

            alert("Usuário deletado com sucesso!");

            setNome("");

        } catch (error) {

            console.error("Erro ao deletar o usuário:", error);
            alert("Erro ao conectar com o servidor");

        }
    };

    return (
        <div>


            <button
                className="bottonDeletar"
                onClick={deletar}
            >
                Deletar
            </button>

        </div>
    );
}

export default BottonDeletar;