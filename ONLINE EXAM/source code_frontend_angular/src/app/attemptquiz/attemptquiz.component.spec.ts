import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AttemptquizComponent } from './attemptquiz.component';

describe('AttemptquizComponent', () => {
  let component: AttemptquizComponent;
  let fixture: ComponentFixture<AttemptquizComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AttemptquizComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AttemptquizComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
