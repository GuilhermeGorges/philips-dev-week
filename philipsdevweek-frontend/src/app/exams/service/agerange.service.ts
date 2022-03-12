import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Agerange } from '../model/agerange';

@Injectable({
  providedIn: 'root'
})
export class AgerangeService {

  constructor(
    private http: HttpClient
    ) { }

    listAgeRange(): Observable<Agerange[]>{
    const url = '/assets/occurrences.json';
    return this.http.get<Agerange[]>(url);
  }
}
