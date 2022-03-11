import { Injectable } from '@angular/core';
import { Region } from '../model/region';

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
