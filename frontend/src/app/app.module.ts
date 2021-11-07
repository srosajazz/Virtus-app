import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './componentes/navbar/navbar.component';
import { ScreensearchComponent } from './componentes/screensearch/screensearch.component';
import { SearchformComponent } from './componentes/searchform/searchform.component';
import { StartComponent } from './componentes/start/start.component';
import { ListaparoquiasComponent } from './componentes/listaparoquias/listaparoquias.component';
import { DetalheparoquiaComponent } from './componentes/detalheparoquia/detalheparoquia.component';

@NgModule({
  declarations: [
    AppComponent,
    StartComponent,
    ScreensearchComponent,
    NavbarComponent,
    SearchformComponent,
    ListaparoquiasComponent,
    DetalheparoquiaComponent,
  ],
  imports: [BrowserModule, AppRoutingModule, FormsModule, HttpClientModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
