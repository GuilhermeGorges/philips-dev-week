import { Injectable } from '@angular/core';
import { Occurrence } from '../model/occurrence';

@Injectable({
  providedIn: 'root'
})
export class OccurrenceService {

  constructor() { }


  listOccurrences(): Occurrence[]{
    return [
      {id: 0, regiao_id: 1, mes: 2, faixa_id: 2, qnt_exames: 1}
    ];
  }
}
