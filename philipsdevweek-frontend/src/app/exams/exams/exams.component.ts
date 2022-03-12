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
    this.occurrenceService.listOccurrences().subscribe(exam_occurrence => {this.exam_occurrence = exam_occurrence});
    this.ageRangeService.listAgeRange().subscribe(agerange => {this.agerange = agerange});
    this.regionService.listRegions().subscribe(regions => {this.regions = regions});
  }
}
