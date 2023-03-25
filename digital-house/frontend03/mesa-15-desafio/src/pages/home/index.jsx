import { useState, useEffect } from "react";
import axios from "axios";
import { Link, useNavigate } from "react-router-dom";

export default function Home() {
    
    const [alunos, setAlunos] = useState([]);
    const navigate = useNavigate();

    function editarAluno(aluno) {
        navigate("/cadastro", {
            state: {
                aluno_id: aluno._id,
                aluno_nome: aluno.nome,
                aluno_matricula: aluno.matricula,
                aluno_curso: aluno.curso,
                aluno_bimestre: aluno.bimestre,
            }
        });
    }

    async function getAlunos(){
        try {
            const response = await axios.get("https://api-aluno.vercel.app/aluno");
            setAlunos(response.data);
        } catch (error) {
            alert("Erro ao buscar dados")
        }
    };

    async function deleteAluno(id){
        try {
            await axios.delete(`https://api-aluno.vercel.app/aluno/${id}`);
            getAlunos();
            alert("Aluno apagado com sucesso")
        } catch (error) {
            alert("Erro ao apagar aluno")
        }
    }

    useEffect(() => {
        getAlunos();
    }, []);
    
    return(
        <>
            <nav class="navbar navbar-expand-lg bg-body-tertiary bg-dark">
                <div class="container-fluid">
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                        <a class="nav-link active text-light fw-bold" aria-current="page" href="" onClick={() => navigate('/')}>Home</a>
                        </li>
                        <li class="nav-item ">
                        <a class="nav-link text-light" href="" onClick={() => navigate("/cadastro", {state: {aluno_id: "", aluno_nome: "", aluno_matricula: "", aluno_curso: "", aluno_bimestre: "",}})}>Cadastro</a>
                        </li>
                    </ul>
                    </div>
                </div>
            </nav>
            <div class="container mt-4">
                <div class="row row-cols-3">
                    {alunos.map((aluno) => (
                        <div key={aluno._id} class="col">
                            <div class="card text-bg-secondary mb-3">
                                <div class="card-header d-flex justify-content-between">{aluno.matricula} <div><button type="button" class="btn btn-light" onClick={() => editarAluno(aluno)}>Editar</button> <button type="button" class="btn btn-danger" onClick={() => deleteAluno(aluno._id)}>Apagar</button></div></div>
                                <div class="card-body">
                                    <h5 class="card-title">{aluno.nome}</h5>
                                    <p class="card-text">Curso: {aluno.curso} <br /> Bimestre: {aluno.bimestre}</p>
                                </div>
                            </div>  
                        </div>
                    ))} 
                </div>
            </div>
        </>
        
    )
}