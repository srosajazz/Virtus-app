import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DetalheparoquiaComponent } from './componentes/detalheparoquia/detalheparoquia.component';
import { ListaparoquiasComponent } from './componentes/listaparoquias/listaparoquias.component';
import { SearchformComponent } from './componentes/searchform/searchform.component';
import { StartComponent } from './componentes/start/start.component';

const routes: Routes = [
  { path: '', component: StartComponent },
  { path: 'search', component: SearchformComponent },
  { path: 'listaparoquias/:id', component: ListaparoquiasComponent },
  { path: 'detalhe/:id', component: DetalheparoquiaComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
