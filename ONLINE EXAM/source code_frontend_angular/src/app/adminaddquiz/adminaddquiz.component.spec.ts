import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminaddquizComponent } from './adminaddquiz.component';

describe('AdminaddquizComponent', () => {
  let component: AdminaddquizComponent;
  let fixture: ComponentFixture<AdminaddquizComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminaddquizComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AdminaddquizComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
