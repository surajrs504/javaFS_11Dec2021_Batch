import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StudentviewquizComponent } from './studentviewquiz.component';

describe('StudentviewquizComponent', () => {
  let component: StudentviewquizComponent;
  let fixture: ComponentFixture<StudentviewquizComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StudentviewquizComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(StudentviewquizComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
