import { Tema } from "./Tema"
import { Usuario } from "./Usuario"

//criando a classe Postagem 
export class Postagem{
    public id:number
    public titulo: string
    public texto: string
    public data:Date
    public usuario:Usuario
    public tema:Tema
}