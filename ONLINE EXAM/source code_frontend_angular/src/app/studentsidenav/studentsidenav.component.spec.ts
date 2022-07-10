import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StudentsidenavComponent } from './studentsidenav.component';

describe('StudentsidenavComponent', () => {
  let component: StudentsidenavComponent;
  let fixture: ComponentFixture<StudentsidenavComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StudentsidenavComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(StudentsidenavComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
