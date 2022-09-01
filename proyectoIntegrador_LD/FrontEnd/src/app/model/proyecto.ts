export class Proyecto {
    id?: number;
    nombreP: string;
    descripcionP: string;
    imgP: string;
    link: string;

    constructor(nombreP: string, descripcionP: string, imgP: string, link: string){
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.imgP = imgP;
        this.link = link;
    }
}
