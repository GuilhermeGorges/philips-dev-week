import { Injectable } from '@angular/core';
import { Agerange } from '../model/agerange';

@Injectable({
  providedIn: 'root'
})
export class AgerangeService {

  constructor() { }

  listAgeRange(): Agerange[]{
    return [
      {id: 0, faixa_i: 1, faixa_n: 2, descricao: "Norte"}
    ];
  }
}
