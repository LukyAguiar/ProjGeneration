import { Postagem } from "./Postagem"


//Criando a Classe Usuario -
export class Usuario{
    public id: number
    public nome: string
    public usuario: string
    public senha: string
    public foto: string
    public tipo: string
    public postagem:Postagem[]
}