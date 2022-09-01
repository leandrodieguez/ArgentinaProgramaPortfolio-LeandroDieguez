import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EditbannerComponent } from './componentes/acerca-de/editbanner.component';
import { EditpersonaComponent } from './componentes/acerca-de/editpersona.component';
import { EditeducacionComponent } from './componentes/educacion/editeducacion.component';
import { NeweducacionComponent } from './componentes/educacion/neweducacion.component';
import { EditExperienciaComponent } from './componentes/experiencia/edit-experiencia.component';
import { NewExperienciaComponent } from './componentes/experiencia/new-experiencia.component';
import { EdithabilidadComponent } from './componentes/habilidades/edithabilidad.component';
import { NewhabilidadComponent } from './componentes/habilidades/newhabilidad.component';
import { HomeComponent } from './componentes/home/home.component';
import { LoginComponent } from './componentes/login/login.component';
import { EditproyectoComponent } from './componentes/proyectos/editproyecto.component';
import { NewproyectoComponent } from './componentes/proyectos/newproyecto.component';

const routes: Routes = [
  { path:'', component: HomeComponent},
  { path:'login', component: LoginComponent},
  { path:'nuevaexp', component: NewExperienciaComponent},
  { path: 'editexp/:id', component: EditExperienciaComponent},
  { path: 'nuevaedu', component: NeweducacionComponent},
  { path: 'editedu/:id', component: EditeducacionComponent},
  { path: 'nuevahab', component: NewhabilidadComponent},
  { path:  'edithab/:id', component: EdithabilidadComponent},
  { path: 'nuevopro', component: NewproyectoComponent},
  { path: 'editpro/:id', component: EditproyectoComponent},
  { path: 'editper/:id', component: EditpersonaComponent},
  { path: 'editbanner/:id', component: EditbannerComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
