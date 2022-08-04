import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminquizquestionsComponent } from './adminquizquestions.component';

describe('AdminquizquestionsComponent', () => {
  let component: AdminquizquestionsComponent;
  let fixture: ComponentFixture<AdminquizquestionsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminquizquestionsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AdminquizquestionsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
