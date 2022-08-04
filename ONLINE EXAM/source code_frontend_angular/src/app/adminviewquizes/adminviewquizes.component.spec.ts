import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminviewquizesComponent } from './adminviewquizes.component';

describe('AdminviewquizesComponent', () => {
  let component: AdminviewquizesComponent;
  let fixture: ComponentFixture<AdminviewquizesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminviewquizesComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AdminviewquizesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
