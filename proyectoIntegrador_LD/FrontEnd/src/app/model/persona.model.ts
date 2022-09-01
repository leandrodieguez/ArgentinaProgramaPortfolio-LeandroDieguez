export class Persona{
    id?: number;
    nombre: string;
    apellido: string;
    img: string;
    about: string;
    title: string;
    banner: string;

    constructor(nombre: string, apellido: string, img: string, about: string, title: string, banner: string){
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
        this.about = about;
        this.title = title;
        this.banner = banner;
    }
}