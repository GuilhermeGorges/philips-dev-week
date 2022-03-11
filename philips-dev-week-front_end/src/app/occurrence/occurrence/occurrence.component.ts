import { RegionService } from './../service/region.service';
import { Region } from './../model/region';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-occurrence',
  templateUrl: './occurrence.component.html',
  styleUrls: ['./occurrence.component.css']
})
export class OccurrenceComponent implements OnInit {

  regions: Region[] = [];
  constructor(private regionService:RegionService) { }

  ngOnInit(): void {
    this.regions = this.regionService.listRegions();
  }

}
