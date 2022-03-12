import { Component, OnInit } from '@angular/core';
import { Region } from '../model/region';
import { Agerange } from '../model/agerange';
import { Occurrence } from '../model/occurrence';
import { AgerangeService } from '../service/agerange.service';
import { OccurrenceService } from '../service/occurrence.service';
import { RegionService } from '../service/region.service';

@Component({
  selector: 'app-exams',
  templateUrl: './exams.component.html',
  styleUrls: ['./exams.component.css']
})
export class ExamsComponent implements OnInit {

  exam_occurrence: Occurrence[] = [];
  regions: Region[] = [];
  agerange: Agerange[] = [];

  constructor(
    private regionService: RegionService,
    private occurrenceService: OccurrenceService,
    private ageRangeService: AgerangeService
    ) { }

  ngOnInit(): void {
    this.exam_occurrence = this.occurrenceService.listOccurrences();
    this.regions = this.regionService.listRegions();
    this.agerange = this.ageRangeService.listAgeRange();
  }
}
