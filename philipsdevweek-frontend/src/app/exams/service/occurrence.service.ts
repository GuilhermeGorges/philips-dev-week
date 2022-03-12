import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Occurrence } from '../model/occurrence';

@Injectable({
  providedIn: 'root'
})
export class OccurrenceService {

  constructor(
    private http: HttpClient
    ) { }

  listOccurrences(): Observable<Occurrence[]>{
    const url = '/assets/occurrences.json';
    return this.http.get<Occurrence[]>(url);
  }
}
