import { Region } from './../model/region';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RegionService {

  constructor() { }
  
  listRegions(): Region[]{
    return [
      {id: 0, regiao: 'Sul', total_exames: 5000}
    ];
  }
}
