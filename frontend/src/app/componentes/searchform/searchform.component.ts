import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CidadesService } from 'src/app/servicos/cidades.service';
import { EstadosService } from 'src/app/servicos/estados.service';
import { Cidade } from '../model/Cidade';
import { Estado } from '../model/Estado';

@Component({
  selector: 'app-searchform',
  templateUrl: './searchform.component.html',
  styleUrls: ['./searchform.component.css'],
})
export class SearchformComponent implements OnInit {
  public listaEstados: Estado[] = [];
  public listaCidades: Cidade[] = [];
  public idEstado: number = 0;
  public idCidade: number = 0;

  // Make sure create constructor this way
  constructor(
    private estadoService: EstadosService,
    private cidadeService: CidadesService,
    private router: Router
  ) {}

  // Make sure create constructor this way
  ngOnInit(): void {
    this.estadoService.getAllEstados().subscribe(
      (res: Estado[]) => {
        this.listaEstados = res;
      },
      (err: any) => {
        alert('Erro ao recuperar lista de estados');
      }
    );
  }

  public buscarCidades() {
    this.cidadeService.getCidadesPorEstado(this.idEstado).subscribe(
      (res: Cidade[]) => {
        this.listaCidades = res;
        console.log(this.listaCidades);
      },
      (err: any) => {
        alert('Erro ao recuperar lista de cidades');
      }
    );
  }

  public buscarParoquias() {
    this.router.navigate(['listaparoquias', this.idCidade]);
  }
}
