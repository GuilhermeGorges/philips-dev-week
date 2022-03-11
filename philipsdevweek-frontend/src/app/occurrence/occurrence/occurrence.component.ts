import { Component, OnInit } from '@angular/core';
import { Region } from '../model/region';
import { RegionService } from '../service/region.service';

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
