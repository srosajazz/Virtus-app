import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ParoquiasService } from 'src/app/servicos/paroquias.service';
import { PaginaParoquias } from '../model/PaginaParoquias';
@Component({
  selector: 'app-listaparoquias',
  templateUrl: './listaparoquias.component.html',
  styleUrls: ['./listaparoquias.component.css'],
})
export class ListaparoquiasComponent implements OnInit {
  public idCidade: number;
  public page: number;
  public paginaParoquia: PaginaParoquias = new PaginaParoquias();

  constructor(
    private paroquiaService: ParoquiasService,
    private activeRoute: ActivatedRoute
  ) {
    let strId = this.activeRoute.snapshot.params['id'];
    let strPage = this.activeRoute.snapshot.queryParams['page'];
    // console.log('Pagina recuperada -> = ' + strPage);

    this.idCidade = parseInt(strId);

    if (strPage != null) {
      this.page = parseInt(strPage);
    } else {
      this.page = 0;
    }

    this.paroquiaService
      .recuperarParoquiasPorCidade(this.idCidade, this.page)
      .subscribe(
        (res: PaginaParoquias) => {
          this.paginaParoquia = res;
        },
        (err: any) => {
          alert('Erro ao recuperar listas de paroquias');
        }
      );
  }

  ngOnInit(): void {}
}
