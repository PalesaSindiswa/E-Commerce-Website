import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReadymealsComponent } from './readymeals.component';

describe('ReadymealsComponent', () => {
  let component: ReadymealsComponent;
  let fixture: ComponentFixture<ReadymealsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ReadymealsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ReadymealsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
