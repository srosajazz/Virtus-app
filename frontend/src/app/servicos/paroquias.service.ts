import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { PaginaParoquias } from '../componentes/model/PaginaParoquias';
import { Paroquia } from '../componentes/model/Paroquia';

@Injectable({
  providedIn: 'root',
})
export class ParoquiasService {
  constructor(private http: HttpClient) {}

  // 1
  public recuperarParoquiasPorCidade(
    idCidade: number,
    pagina: number
  ): Observable<PaginaParoquias> {
    return this.http.get<PaginaParoquias>(
      environment.apiURL + '/paroquias?cidade=' + idCidade + '&page=' + pagina
    );
  }

  // 2
  public recuperarDetalhesDaParoquia(idParoquia: number): Observable<Paroquia> {
    return this.http.get<Paroquia>(
      environment.apiURL + '/paroquias/' + idParoquia
    );
  }
}
